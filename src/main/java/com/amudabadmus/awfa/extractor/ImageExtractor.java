package com.amudabadmus.awfa.extractor;
import java.io.*;
import net.sourceforge.tess4j.*;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;

@Named
@RequestScoped
@ManagedBean(name="imageExtractor")
public class ImageExtractor
{
    private String imgText;
    public String getImgText(String imageLocation) {
        File imageFile = new File(imageLocation);
        ITesseract instance = new Tesseract();
        try {
            imgText = instance.doOCR(imageFile);
            return imgText;
        } catch (TesseractException e) {
            e.getMessage();
            return "Error while reading image";
        }
    }
}
