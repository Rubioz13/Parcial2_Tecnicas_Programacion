public class Producto {
        private String nombre;
        private String descripcion;
        private int precio;
        private float cantidadInventario;

        public Producto(String nombre, String descripcion, double precio, int cantidadInventario) {
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.precio = (int) precio;
            this.cantidadInventario = cantidadInventario;
        }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadInventario() {
        return (int) cantidadInventario;
    }

    public String getNombre() {
        return nombre;

    }
    public class Laptop extends Producto{
        private int cantidadInventario;
        private double precio;
        private String descripcion;
        private String nombre;

        public class Laptop extends Producto {
            super(nombre, descripcion, precio, cantidadInventario);

        }
        public class Telefono extends Producto {
           super (nombre, descripcion, precio, cantidadInventario);

            }
        public class Accesorios extends Producto {
            super (nombre; descripcion; precio, cantidadInventario);

            }
        }
    }


