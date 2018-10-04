package ar.edu.unlam.pb2;

public class Pilas2 {

	private Integer minutos;
	private Integer velCarga;
	private Integer velConsumo;
	private Integer carga=0;
	private Integer consumoTotal=0;
	private Integer cargasTotales=0;
	
	
	public Pilas2 (Integer velCarga, Integer velConsumo) {
		this.velCarga = velCarga;
		this.velConsumo = velConsumo;
	}
	
	
	public Integer medirCarga() {
		return this.carga;
	}
	
	public void cargar(Integer minutos) {
		if (this.carga+(minutos*velCarga)>=100) {
			this.carga=100;
			this.cargasTotales+=1;
		} else {
			this.carga+=(minutos*velCarga);
		}
	}
	
	public void consumir(Integer minutos) {
		if(this.carga-(minutos*velConsumo)<0) {
			this.carga=0;
			this.consumoTotal+=(this.carga*minutos);
		} else {
			this.carga-=(minutos*velConsumo);
			this.consumoTotal+=minutos;
		}
	}
	
	public Integer consumoTotal() {
		return this.consumoTotal;
	}
	
	public Integer cargasTotales() {
		return this.cargasTotales;
	}
	
}
