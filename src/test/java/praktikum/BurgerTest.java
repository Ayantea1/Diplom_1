package praktikum;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static praktikum.IngredientType.SAUCE;


@RunWith(MockitoJUnitRunner.class)
public class BurgerTest extends TestCase {


 @Mock
 Ingredient ingredient1;
 @Mock
 Ingredient ingredient2;
 @Mock
 Bun bun;

 @Test
    public void testAddIngredient() {
     Burger burger = new Burger();
     burger.addIngredient(ingredient1);
     assertEquals(1, burger.ingredients.size());
    }

    @Test
    public void testMoveIngredient(){
        Burger burger = new Burger();
        burger.addIngredient(ingredient1);
        burger.addIngredient(ingredient2);
        burger.moveIngredient(1,0);
        assertEquals(ingredient2, burger.ingredients.get(0));
    }

@Test
    public void testRemoveIngredient() {
    Burger burger = new Burger();
    burger.addIngredient(ingredient1);
    burger.removeIngredient(0);
    assertEquals(0, burger.ingredients.size());
    }

@Test
    public void testGetPrice() {
        Mockito.when(bun.getPrice()).thenReturn(200F);
    Mockito.when(ingredient1.getPrice()).thenReturn(150F);
    Burger burger = new Burger();
    burger.setBuns(bun);
    burger.addIngredient(ingredient1);
    assertEquals(550F,burger.getPrice(),0);
    }

    @Test
    public void testGetReceipt() {
        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(ingredient1);
        Mockito.when(bun.getName()).thenReturn("pan");
        Mockito.when(ingredient1.getType()).thenReturn(SAUCE);
        Mockito.when(ingredient1.getName()).thenReturn("test");
        Mockito.when(burger.getPrice()).thenReturn(150F);
        assertEquals(String.format("(==== %s ====)%n= %s %s =%n(==== %s ====)%n%nPrice: %f%n","pan","sauce","test","pan",150F),burger.getReceipt());
    }
}