package Geometria;

public class Cone {
	
	private float altura;
	private float raio;
	private int tipo;
	
	public Cone(float altura, float raio, int tipo) {
		this.altura = altura;
		this.raio = raio;
		this.tipo = tipo;
	}
	
	public double Pitagoras() {
		double cateto = Math.pow(getAltura(), 2) + Math.pow(getRaio(), 2);
		double hipotenusa = Math.sqrt(cateto);
		return hipotenusa;
	}
	
	public double areaLateral() {
		double area = 3.14 * getRaio() * Pitagoras();
		return area;
	}
	
	public double areaFundo() {
		double area = 3.14 * Math.pow(getRaio(), 2);
		return area;
	}
	
	public double areaTotal() {
		double area = areaLateral() + areaFundo();
		return area;
	}
	
	public double Litros() {
		double litros = 3.45 * areaTotal();
		return litros;
	}
	
	public double Latas() {
		double lata = Litros()/18;
		int conversao = (int) Math.round(lata);
		return conversao;
	}
	
	public double Gasto() {
		double gasto = 0;
		if (getTipo() == 1) {
			gasto = 238.90 * Latas();
		}
		else if (getTipo() == 2) {
			gasto = 467.98 * Latas();
		}
		else {
			gasto = 758.34 * Latas();
		}
		return gasto;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float getAltura() {
		return this.altura;
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	public float getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cone [altura=");
		builder.append(altura);
		builder.append(", raio=");
		builder.append(raio);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}
}
