package co.simplon.Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.simplon.model.CandidaturesManager;
import co.simplon.model.Client;

/**
 * Servlet implementation class BasicServlet
 */
@WebServlet("/FormulaireServlet")
public class FormulaireServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormulaireServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("listeReservation", CandidaturesManager.getInstance().getCandidatures());
		this.getServletContext().getRequestDispatcher("/ListeCandidatures.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Récupération des informations saisies par l'utilisateur
				String nom = request.getParameter("nom");
				String prenom = request.getParameter("prenom");
				String telephone = request.getParameter("telephone");
				String email = request.getParameter("email");
				String adresse = request.getParameter("adresse");
				//List<Client> candidatures = new ArrayList<Client>();
				
				System.out.println("Nom : " + request.getParameter("nom"));
				System.out.println("Prénom : " + request.getParameter("prenom"));
				System.out.println("Téléphone : " + request.getParameter("telephone"));
				System.out.println("E-mail : " + request.getParameter("email"));
				System.out.println("Adresse : " + request.getParameter("adresse"));
				
				getServletContext().getRequestDispatcher("/validationFormulaire.jsp").forward(request, response);
			
				Client newClient = new Client();
				newClient.setNom(nom);
				newClient.setPrenom(prenom);
				newClient.setTelephone(telephone);
				newClient.setEmail(email);
				newClient.setAdresse(adresse);
				
				
				CandidaturesManager.getInstance().addClient(newClient);
				//candidatures.add(newClient);
			}
		}

