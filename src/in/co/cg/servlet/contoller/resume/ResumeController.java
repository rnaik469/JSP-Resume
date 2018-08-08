package in.co.cg.servlet.contoller.resume;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.cg.servlet.model.resume.Resume;

/**
 * @author Rohit Naik
 *
 */
@WebServlet("/resume")
public class ResumeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
  
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Resume resume=new Resume();	//Instantiating Class Resume
		
		//Set parameters from html page to setters
		resume.setAddress(request.getParameter("Address"));
		resume.setfName(request.getParameter("fName").toUpperCase());
		resume.setContactNo(request.getParameter("contact"));
		resume.setDob(request.getParameter("dob"));
		resume.setlName(request.getParameter("lName").toUpperCase());
		resume.sethQualification(request.getParameter("HQValue"));
		resume.setSkills(request.getParameterValues("skills"));
		resume.setSummary(request.getParameter("desc"));
		resume.setWebsite(request.getParameter("weburl"));
		resume.setEmail(request.getParameter("email"));
		resume.setGender(request.getParameter("gender"));
		resume.setHobbies(request.getParameterValues("hobbies"));
		resume.setImageSource(request.getParameter("photo"));
		request.setAttribute("ResumeModel", resume);
		
		//Request for output.jsp
		RequestDispatcher dispatcher=request.getRequestDispatcher("output.jsp");
		dispatcher.forward(request, response);

	}

}
