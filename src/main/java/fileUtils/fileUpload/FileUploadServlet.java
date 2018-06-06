package fileUtils.fileUpload;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fileupload")
public class FileUploadServlet {
	private Logger logger = Logger.getLogger(FileUploadServlet.class);
}