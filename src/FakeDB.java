public class FakeDB implements Database {
    @Override
    public void save(Persona persona){
        System.out.println("Guardando en la BBDD: " + persona.getName() + persona.getId());
    }

    @Override
    public Object receive(int id){
        return null;
    }

}
