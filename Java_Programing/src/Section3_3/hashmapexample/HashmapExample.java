package Section3_3.hashmapexample;

import java.util.HashMap;

public class HashmapExample

{
    public static void main(String[] args)

    {
        HashMap<String, String> fruitBowl = new HashMap<>(); // <Objeto chave, Objeto de valor>

        fruitBowl.put("Maçã", "Verde");
        fruitBowl.put("Cereja", "Vermelho");
        fruitBowl.put("Banana", "Amarelo");
        fruitBowl.put("Laranja", "Laranja");
        fruitBowl.put("Maçã", "Vermelho");
        fruitBowl.put(null, null);
        fruitBowl.put("Qualquer", null);
        fruitBowl.put(null, "Qualquer");

        
        System.out.println(fruitBowl);

        // for (String arrTemp : fruitBowl.keySet())
        //
        // {
        // System.out.println("Chave: " + arrTemp + ", Valor: " +
        // fruitBowl.get(arrTemp));
        // }

        for (HashMap.Entry<String, String> arrTemp : fruitBowl.entrySet())

        {
            System.out.println("Chave: " + arrTemp.getKey() + ", Valor: " + arrTemp.getValue());
        }

        findElement(fruitBowl, "Maçã");
    }

    private static void findElement(HashMap<String, String> fruitBowl, String fruit) {
        if (fruitBowl.containsKey(fruit)) {
            // System.out.println("O fruto " + fruit + " existe na tigela.");
            System.out.println("A " + fruit + " é: " + fruitBowl.get(fruit));
        } else {
            System.out.println("Essa fruta " + fruit + " não existe na tigela.");
        }
    }
}

