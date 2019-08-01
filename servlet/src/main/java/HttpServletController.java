import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.Enumeration;

public class HttpServletController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Enumeration<String> contextConfigs = getServletConfig().getServletContext().getInitParameterNames();
        int i = 1;
        while(contextConfigs.hasMoreElements()){
            String nextElement = contextConfigs.nextElement();
            System.out.println("第"+i+"个参数：key,"+nextElement+",value,"+
                    getServletConfig().getServletContext().getInitParameter(nextElement));
            i++;
        }

        Enumeration initParameterNames= getServletConfig().getInitParameterNames();
        int num = 1;
        while(initParameterNames.hasMoreElements()){
            String nextElement = (String) initParameterNames.nextElement();
            System.out.println("第"+num+"个参数：key,"+nextElement+",value,"+
                    getServletConfig().getInitParameter((nextElement)));
            num++;
        }

        System.out.println(getInitParameter("year"));

        System.out.println("HttpServletController service..............."+new Date());
        req.setAttribute("servlet","HttpServletController....."+new Date());
        req.getRequestDispatcher("/servlet.jsp").forward(req,resp);
    }
}
