 package Code;

public class Person {
    String Nombres, Apellidos, Direccion, Email, Genero, Departamento, Validacion;
    long Cedula, Celular, Telefono, SalarioBase, HoraHED, HoraHEN,HED, HEN, AuxTrans, Salario;

    public Person(String Nombres, String Apellidos, String Direccion, String Email, String Genero, String Departamento, String Validacion, long Cedula, long Celular, long Telefono, long SalarioBase, long HoraHED, long HoraHEN, long HED, long HEN, long AuxTrans, long Salario) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Direccion = Direccion;
        this.Email = Email;
        this.Genero = Genero;
        this.Departamento = Departamento;
        this.Validacion = Validacion;
        this.Cedula = Cedula;
        this.Celular = Celular;
        this.Telefono = Telefono;
        this.SalarioBase = SalarioBase;
        this.HoraHED = HoraHED;
        this.HoraHEN = HoraHEN;
        this.HED = HED;
        this.HEN = HEN;
        this.AuxTrans = AuxTrans;
        this.Salario = Salario;
    }

    Person(long Cedula) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public String getValidacion() {
        return Validacion;
    }

    public void setValidacion(String Validacion) {
        this.Validacion = Validacion;
    }

    public long getCedula() {
        return Cedula;
    }

    public void setCedula(long Cedula) {
        this.Cedula = Cedula;
    }

    public long getCelular() {
        return Celular;
    }

    public void setCelular(long Celular) {
        this.Celular = Celular;
    }

    public long getTelefono() {
        return Telefono;
    }

    public void setTelefono(long Telefono) {
        this.Telefono = Telefono;
    }

    public long getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(long SalarioBase) {
        this.SalarioBase = SalarioBase;
    }

    public long getHoraHED() {
        return HoraHED;
    }

    public void setHoraHED(long HoraHED) {
        this.HoraHED = HoraHED;
    }

    public long getHoraHEN() {
        return HoraHEN;
    }

    public void setHoraHEN(long HoraHEN) {
        this.HoraHEN = HoraHEN;
    }

    public long getHED() {
        return HED;
    }

    public void setHED(long HED) {
        this.HED = HED;
    }

    public long getHEN() {
        return HEN;
    }

    public void setHEN(long HEN) {
        this.HEN = HEN;
    }

    public long getAuxTrans() {
        return AuxTrans;
    }

    public void setAuxTrans(long AuxTrans) {
        this.AuxTrans = AuxTrans;
    }

    public long getSalario() {
        return Salario;
    }

    public void setSalario(long Salario) {
        this.Salario = Salario;
    }

    
}

