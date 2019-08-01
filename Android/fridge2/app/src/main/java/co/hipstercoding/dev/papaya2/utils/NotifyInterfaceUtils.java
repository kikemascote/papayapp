package co.hipstercoding.dev.papaya2.utils;

import co.hipstercoding.dev.papaya2.data.Food;



public interface NotifyInterfaceUtils {

    void onAddFood();
    void onAddSection();
    void updateUi();
    void deleteFood(Food deletedFood);

}
