package Geometria;

public class Piramide {
	
	private float altura;
	private float raio;
	private int  tipo;
	
	public Piramide(float altura, float raio, int tipo) {
		this.altura = altura;
		this.raio = raio;
		this.tipo = tipo;
	}
	
	public double Pitagoras() {
		double cateto = Math.pow(getAltura(), 2) + Math.pow(getRaio(), 2);
		double hipotenusa = Math.sqrt(cateto);
		return hipotenusa;
	}
	
	public double areaBase() {
		double area = Math.pow((raio * 2), 2);
		return area;
	}
	
	public double areaTriangulo() {
		double area = (Pitagoras() * getAltura())/2;
		return area;
	}
	
	public double areaTotal() {
		double area = (areaTriangulo() * 4) + areaBase();
		return area;
	}
	
	public double Volume() {
		double volume = (areaBase() * getAltura())/3;
		return volume;
	}
	
	public double Litros() {
		double litros = areaTotal()/4.76;
		return litros;
	}
	
	public int Latas() {
		double latas = Litros()/18;
		int conversao = (int) Math.round(latas);
		return conversao;
	}
	
	public double Gasto() {
		double gasto = 0;
		if (getTipo() == 1) {
			gasto = 127.90 * Latas();
		}
		else if (getTipo() == 2) {
			gasto = 258.98 * Latas();
		}
		else {
			gasto = 344.34 * Latas();
		}
		return gasto;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Piramide [altura=");
		builder.append(altura);
		builder.append(", raio=");
		builder.append(raio);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}
}
