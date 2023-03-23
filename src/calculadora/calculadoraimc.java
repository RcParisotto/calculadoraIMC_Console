package calculadora;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rober
 */
public class calculadoraimc {
    
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Float getPeso() {
        return Peso;
    }

    public void setPeso(Float Peso) {
        this.Peso = Peso;
    }

    public Float getAltura() {
        return Altura;
    }

    public void setAltura(Float Altura) {
        this.Altura = Altura;
    }

    private String CPF;
    private String Nome;
    private Float Peso;
    private Float Altura;

    public Float calcularIMC() {
        Float indice = getPeso() / (getAltura() * getAltura());
        return indice;
    }

    public String classificarIMC() {
        if (calcularIMC() < 18.5)
            return "Abaixo do peso";
        else if (calcularIMC() >= 18.5 || calcularIMC() <= 24.9)
            return "Peso normal";
        else if (calcularIMC() >= 25.0 || calcularIMC() <= 29.9)
            return "Sobrepeso";
        else if (calcularIMC() >= 30.0 || calcularIMC() <= 39.9)
            return "Obesidade";
        else if (calcularIMC() >= 40.0)
            return "Obesidade grave";
        return "";
        
    }  
}
