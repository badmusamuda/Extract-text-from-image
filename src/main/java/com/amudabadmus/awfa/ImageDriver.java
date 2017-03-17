package com.amudabadmus.awfa;
import com.amudabadmus.awfa.extractor.ImageExtractor;
public class ImageDriver
{
	public String imgText = "C:\\Users\\User\\Pictures\\flutterwave\\1.png";
	ImageExtractor imageExtractor = new ImageExtractor();
	public String getImgText ()
	{
		return imageExtractor.getImgText(imgText);
	}
	public void setImgText( String myImgTxt)
	{
		//this.imgText = imageExtractor.extractImageContent(myImgTxt);
	}

	public static void main (String[]args)
	{
		ImageDriver imageDriver = new ImageDriver();
		System.out.println(imageDriver.getImgText());
	}
}