package Geometria;

public class Cubo {
	
	private float lado;
	private float rendimento;
	private int tipo;
	
	public Cubo(float lado, float rendimento, int tipo) {
		this.lado = lado;
		this.rendimento = rendimento;
		this.tipo = tipo;
	}
	
	public double areaTotal() {
		double quadrado = Math.pow(getLado(), 2);
		return quadrado * 6;
	}
	
	public double Litros() {
		return areaTotal()/getRendimento();
	}
	
	public double Latas() {
		double latas = Litros()/18;
		int conversao = (int) Math.round(latas);
		return conversao;
	}
	
	public double Gasto() {
		double gasto = 0;
		if (getTipo() == 1) {
			gasto = 101.90 * Latas();
		}
		else if (getTipo() == 2) {
			gasto = 212.45 * Latas();
		}
		else {
			gasto = 345.56 * Latas();
		}
		return gasto;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	public float getRendimento() {
		return rendimento;
	}

	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
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
		builder.append("Cubo [lado=");
		builder.append(lado);
		builder.append(", rendimento=");
		builder.append(rendimento);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}
}
