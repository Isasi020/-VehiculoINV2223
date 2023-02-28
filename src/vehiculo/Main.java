
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoNaranjoVicenteIsaac2223 mivehiculoNaranjoVicenteIsaac2223;
        int stockActual;
        
        mivehiculoNaranjoVicenteIsaac2223 = operativaVehiculosNaranjoVicenteIsaac2223(50);
        stockActual = mivehiculoNaranjoVicenteIsaac2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    private static VehiculoNaranjoVicenteIsaac2223 operativaVehiculosNaranjoVicenteIsaac2223(int cantidad) {
        VehiculoNaranjoVicenteIsaac2223 mivehiculoNaranjoVicenteIsaac2223;
        mivehiculoNaranjoVicenteIsaac2223 = new VehiculoNaranjoVicenteIsaac2223("Seat",18000,100);
        try 
        {
            System.out.println("Venta de Vehiculos");
            mivehiculoNaranjoVicenteIsaac2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            mivehiculoNaranjoVicenteIsaac2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        return mivehiculoNaranjoVicenteIsaac2223;
    }

}
    
