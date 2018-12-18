public class Dado 
{
    private int valor;
    
    public void tirar() 
	{
        setValor(1+(int)(Math.random()*6));
    	}
    
    public void imprimir() 
	{
        System.out.println("El valor del dado es:"+getValor());
    	}
    
    public int retornarValor() 
	{
        return getValor();
    	}

    /*
     * GETTERS Y SETTERS
     */
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
}
