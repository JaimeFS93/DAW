package Cuentas;

public class CCuenta {


    /**
     * Metodo que devuelve el nombre
     * @return
     */
    public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo que establece el nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * @return
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * @param tipoInterés
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	//atributos de la clase cuentas
	private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
// constructor
    public CCuenta()
    {
    }

    /**
     * constructor parametrizado
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Metodo para ingresar dinero
     * @return
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Metodo para ingresar dinero
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
