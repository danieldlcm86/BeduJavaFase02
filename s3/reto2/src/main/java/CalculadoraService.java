/*El cliente tiene grandes ideas para la calculadora que hemos desarrollado. Justo ahora nos ha pedido el integrarla en un nuevo proyecto para llevar la calculadora a la nube y liberarla como parte de un servicio de matemáticas, por el cual cobrará una subscripción anual y con eso se volverá millonario. Como primer paso te ha pedido definir una interface para que sus ingenieros, graduados del MIT, puedan trabajar en cómo será la integración del misma en su costosa arquitectura orientada a microservicios. Tu no lo recuerdas, pero pasaste las últimas tres noches trabajando en el diseño de la siguiente interface:*/

public interface CalculadoraService {

    public double add(double input1, double input2);

    public double subtract(double input1, double input2);

    public double multiply(double input1, double input2);

    public double divide(double input1, double input2);
}
