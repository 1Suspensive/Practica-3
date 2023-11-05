import Clases.Person;
import Estructuras.BinarySearchTree;

public class Main{
    public static void main(String[] args){
        
        BinarySearchTree abb = new BinarySearchTree();

        //Prueba
        
        Person persona = new Person("Juan",10101013);
        Person persona2 = new Person("Pablo",10001011);
        Person persona3 = new Person("Maria",10101015);
        Person persona4 = new Person("Ana",1010000);
        Person persona5 = new Person("Diana",10111105);
        Person persona6 = new Person("Mateo",10110005);
        
        
        abb.insert(persona, persona.calculateKey());
        abb.insert(persona2, persona2.calculateKey());
        abb.insert(persona3, persona3.calculateKey());
        abb.insert(persona4, persona4.calculateKey());
        abb.insert(persona5, persona5.calculateKey());
        abb.insert(persona6, persona6.calculateKey());

        //Prueba Remove no funcionando
        //System.out.println(((Person)((BTSEntry) abb.Remove(4).getData()).getData()).getName());


        //Prueba Find
        //System.out.println(((Person) ((BTSEntry) ((abb.find(10)).getData())).getData()).getName());

        //Prueba valor Maximo
        //System.out.println(((Person)((BTSEntry) abb.maxNode(abb.root()).getData()).getData()).getName());
        
        //Prueba valor Minimo
        //System.out.println(((Person)((BTSEntry) abb.minNode(abb.root()).getData()).getData()).getName());

        //Prueba InOrder
        abb.Inorder(abb, abb.root());
    }
}