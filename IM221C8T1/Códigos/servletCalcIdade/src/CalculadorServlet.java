import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("calcular")
public class calculator extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    private String idadePorExt() {
        int dia = 0, mes = 0, ano = 0;
        LocalDate localDate = LocalDate.now();
        LocalDate diaAtual = LocalDate.getDayOfMonth();
        LocalDate mesAtual = LocalDate.getMonthValue();
        LocalDate anoAtual = LocalDate.getYear();

        ano = anoAtual - ano;
        mes = mesAtual - mes;
        dia = diaAtual - dia;

        if (mes < 0) {
            ano = ano - 1;
            mes = 12 + mes;
        }

        if (dia < 0) {
            mes = mes - 1;
            dia = 30 + dia;
        }

        String idade;
        return idade = "<Valor de anos:> " + ano + mes + "<Valor de dias:> " + dia;
    }

    protected doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String nome = "";
        nome = request.getParameter("nome");
        try {
            Integer.valueOf(request.getParameter(“dia”));
            Integer.valueOf(request.getParameter(“mes”));
            Integer.valueOf(request.getParameter(“ano”));
            out.println("<html><body>");
            out.println("<h1>Olá " + nome + "<br/> Você tem " + idade "</h1>");
            out.println("</body></html>");
        } catch (NumberFormatException e) {
            out.println("<html><body><h1>Erro na conversão de algum dos valores.</h1></body></html>");
        }
        out.close();
    }
}
