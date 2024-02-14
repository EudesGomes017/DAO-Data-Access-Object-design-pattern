package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;

	public Department() {

	}

	public Department(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

	/*
	 * Em Java, a interface Serializable é usada para marcar classes cujos objetos
	 * podem ser serializados. Serialização é o processo de converter um objeto em
	 * uma sequência de bytes, que pode ser facilmente armazenada em um arquivo,
	 * transmitida pela rede ou mantida em memória.
	 * 
	 * Ao marcar uma classe com a interface Serializable, você está indicando ao
	 * compilador que essa classe pode ser transformada em uma sequência de bytes e,
	 * portanto, pode ser gravada em um fluxo de saída (como um arquivo ou um fluxo
	 * de rede) ou reconstruída posteriormente a partir desses bytes.
	 * 
	 * Por exemplo, ao usar a serialização em Java, você pode salvar o estado de um
	 * objeto em um arquivo para que ele possa ser recuperado posteriormente, ou
	 * pode enviar objetos pela rede entre diferentes máquinas. Isso é útil em
	 * situações como persistência de dados, comunicação entre sistemas distribuídos
	 * e armazenamento em cache.
	 */

}
