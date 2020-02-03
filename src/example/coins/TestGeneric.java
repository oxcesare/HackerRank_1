/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.coins;

/**
 *
 * @author cesaralducinruiz
 */
public class TestGeneric {
    
    private String name;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "TestGeneric{" + "name=" + name + ", id=" + id + '}';
    }
    
    public static void main(String[] args) {
        
        
        TestGeneric testInterno = new TestGeneric();
        testInterno.setId("87");
        testInterno.setName("Cesar Ricardo");
        
        RequestGeneric<TestGeneric> test = new RequestGeneric<>();
        test.setObjectGeneric(testInterno);
        
        System.out.println(""+test.getObjectGeneric().getId());
        
    }
    
}
