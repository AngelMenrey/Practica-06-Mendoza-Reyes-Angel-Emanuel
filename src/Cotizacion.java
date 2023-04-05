//clase cotizacion 
public class Cotizacion {    
 private int    cantidaddedias;
 private String destinosturisticos,hotel,tipodehabitacio,tipodepago;
 private float subtotal,mensualidad,total,IVA = (float) 0.16;
//constructor
 private Cotizacion siguiente;
    public Cotizacion() {
        this.cantidaddedias = 0;
        this.destinosturisticos = "";
        this.hotel = "";
        this.tipodehabitacio = "";
        this.tipodepago = "";
        this.subtotal = 0;
        this.mensualidad = 0;
        this.total = 0;
        this.siguiente = null;
    }
   //getters y setters
    public int getCantidaddedias() {
        return cantidaddedias;
    }

    public void setCantidaddedias(int cantidaddedias) {
        this.cantidaddedias = cantidaddedias;
    }

    public String getDestinosturisticos() {
        return destinosturisticos;
    }

    public void setDestinosturisticos(String destinosturisticos) {
        this.destinosturisticos = destinosturisticos;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getTipodehabitacio() {
        return tipodehabitacio;
    }

    public void setTipodehabitacio(String tipodehabitacio) {
        this.tipodehabitacio = tipodehabitacio;
    }

    public String getTipodepago() {
        return tipodepago;
    }

    public void setTipodepago(String tipodepago) {
        this.tipodepago = tipodepago;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(float mensualidad) {
        this.mensualidad = mensualidad;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getIVA() {
        return IVA;
    }

    public void setIVA(float IVA) {
        this.IVA = IVA;
    }

    public Cotizacion getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Cotizacion siguiente) {
        this.siguiente = siguiente;
    }
 
}
//clase lista enlazada listacotizador
class Listacotizador {
 private Cotizacion cotizacion;
 //constructor
 public Listacotizador(){
 cotizacion = null;
 }
 //lista enlaza de cotizador
 public void agregar(int cd,String d,String H,String th,String tp,float t){
        Cotizacion nuevo = new Cotizacion();
        nuevo.setCantidaddedias(cd);
        nuevo.setDestinosturisticos(d);
        nuevo.setHotel(H);
        nuevo.setTipodehabitacio(th);
        nuevo.setTipodepago(tp);
        nuevo.setTotal(t);
        if(cotizacion == null){
            cotizacion = nuevo;
        }else{
        Cotizacion aux = cotizacion;
        while (aux.getSiguiente()!=null){
            aux= aux.getSiguiente();
        }
        aux.setSiguiente(nuevo);
        }
    }
    
    public String recorrerDestinos(){
        String datos = "";
        Cotizacion aux = cotizacion;
        if(cotizacion== null){
            datos = "La lista está vacía";
        }else{
            while(aux!= null){
                datos+= "cantidad de dias"+aux.getCantidaddedias()+"\n";
                datos+= "destino turistico"+aux.getDestinosturisticos()+"\n";
                datos+= "tipo de hotel"+aux.getHotel()+"\n";
                datos+= "tipo de habitacion"+aux.getTipodehabitacio()+"\n";
                datos+= "forma de pago"+aux.getTipodepago()+"\n";
                datos+= "total"+aux.getTotal()+"\n";
                aux= aux.getSiguiente();           
            }
        
        }
        return datos;
    }
     public boolean estaVacia(){
        if(cotizacion == null){
            return true;
        }else{
            return false;
        }
    }
}

