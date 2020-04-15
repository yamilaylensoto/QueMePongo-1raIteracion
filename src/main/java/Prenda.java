public class Prenda {
	private Tipo tipo;
	private String material;
	private String categoria;
	private String colorPrimario;
	private String colorSecundario;

// sin colorSecundario?
	public Prenda(Tipo tipo, String colorPrimario, String material, String categoria, String colorSecundario){
		this.tipo = tipo; 
		this.colorPrimario = colorPrimario; 
		this.material = material; 
		this.categoria = categoria;
		this.colorSecundario = colorSecundario;
			if(!tipo.esDeCategoria(categoria)){
				throw new ErrorCategoriaNoCondiceTipo();
			}
	}
}