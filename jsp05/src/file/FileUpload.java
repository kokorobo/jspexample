package file;

import java.io.IOException;


import javax.servlet.http.HttpServletRequest;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class FileUpload {
	public String[] fileUpload(String path, HttpServletRequest req) throws IOException {
		int size = 1024 * 1024 * 10;
		String file=null,orifile = null;
		String[] files = new String[2];
		MultipartRequest multi= new MultipartRequest(req, path, size ,"utf-8"
				, new DefaultFileRenamePolicy());
		file = multi.getFilesystemName("file");
		orifile = multi.getFilesystemName("file");
		files[0] = file; files[1] = orifile;
		return files;
	}
}
