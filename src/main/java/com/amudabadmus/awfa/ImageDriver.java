package com.amudabadmus.awfa;
import com.amudabadmus.awfa.extractor.ImageExtractor;
public class ImageDriver
{
	public String imgText = "C:\\Users\\User\\Pictures\\3.png";
	ImageExtractor imageExtractor = new ImageExtractor();
	public String getImgText ()
	{
		return imageExtractor.extractImageContent(imgText);
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