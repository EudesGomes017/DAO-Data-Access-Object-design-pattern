package model.dao;

import model.dao.impl.SallerDaojDBC;

public class DaoFactory {

	/*
	 * Esse código Java é um exemplo de uma fábrica de DAOs (Data Access Objects).
	 * DAOs são classes que encapsulam o acesso aos dados de uma aplicação,
	 * permitindo a separação clara entre a lógica de negócios e a lógica de acesso
	 * aos dados.
	 * 
	 * Vamos analisar o código linha por linha:
	 */

	/*
	 * Portanto, quando você chama DaoFactory.createSellerDao(), você obtém um
	 * objeto SallerDaojDBC, que pode ser usado para acessar os dados relacionados
	 * aos vendedores no banco de dados JDBC. O uso de uma fábrica desse tipo é útil
	 * porque permite que você altere a implementação subjacente do DAO (por
	 * exemplo, de JDBC para JPA) sem alterar o código que a utiliza. Isso promove a
	 * flexibilidade e a manutenção do código.
	 */
	//par anão expor a implementação retornamos a interface, mas retornando na verdade um instancia de SallerDaojDBC
	public static SallerDao createSellerDao() {

		return new SallerDaojDBC();
	}
}
