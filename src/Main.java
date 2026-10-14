import Controller.PessoaController;
import Model.PessoaService;

void main() {
//Padrão MVC
    PessoaService service = new PessoaService();
    PessoaController controller = new PessoaController(service);

    controller.cadastrar();

    IO.println(controller.mostrar());
    controller.deletar(2);
    IO.println(controller.mostrar());




}
