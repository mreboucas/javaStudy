package mreboucas.java_estudo.merge.blob.copy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import oracle.sql.BLOB;

public class BlobToFile extends Object {
	
	public static void main(String[] args) {
		String filename = "temp";
		BLOB blob = null;
		new BlobToFile().execute(filename, blob);
	}
	
	  public static int execute(String filename, BLOB blob)
	  {
	 
	    int success = 1;
	 
	    try
	    {
	      File              blobFile   = new File(filename);
	      FileOutputStream  outStream  = new FileOutputStream(blobFile);
	      InputStream       inStream   = blob.getBinaryStream();
	      
	 
	      int     length  = -1;
	      int     size    = blob.getBufferSize();
	      byte[]  buffer  = new byte[size];
	 
	      while ((length = inStream.read(buffer)) != -1)
	      {
	        outStream.write(buffer, 0, length);
	        outStream.flush();
	      }
	      //fileItem = (FileItem) outStream;
	 
	      inStream.close();
	      outStream.close();
	    }
	    catch (Exception e)
	    {
	      e.printStackTrace();
	      System.out.println("ERROR(djv_exportBlob) Unable to export:"+filename);
	      success = 0;
	    }
	    finally
	    {
	      return success;
	    }
	 
	  } 
}
