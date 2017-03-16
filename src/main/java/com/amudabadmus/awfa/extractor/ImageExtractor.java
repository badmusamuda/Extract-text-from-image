package com.amudabadmus.awfa.extractor;
import java.io.*;
import net.sourceforge.tess4j.*;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;

@Named
@RequestScoped
@ManagedBean(name="imageExtractor")
public class ImageExtractor {
    public String extractImageContent(String filePath) {
        File imageFile = new File(filePath);
        ITesseract instance = new Tesseract();
        try {
            String result = instance.doOCR(imageFile);
            return result;
        } catch (TesseractException e) {
            e.getMessage();
            return "Error while reading image";
        }
    }
}
