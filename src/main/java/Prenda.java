public class Prenda {
	private Tipo tipo;
	private String material;
	private String categoria;
	private String colorPrimario;
	private String colorSecundario;
	
//-------------------------------------------------------------------------------------------------------------Constructor de prenda SIN colorSecundario
	public Prenda(Tipo tipo, String colorPrimario, String material, String categoria){
		this.tipo = tipo; 
		this.colorPrimario = colorPrimario; 
		this.material = material; 
		this.categoria = categoria;
			if(!tipo.esDeCategoria(categoria)){
				throw new ErrorCategoriaNoCondiceTipo();
			}
		}

//-------------------------------------------------------------------------------------------------------------Constructor de prenda CON colorSecundario
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