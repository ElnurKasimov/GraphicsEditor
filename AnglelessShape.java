package GraphicsEditor;

abstract public class AnglelessShape extends Shape  {
    protected int centreX;
    protected int centreY;

/*  Без наличия этого конструктора по умолчанию IDEA матюкается когда я прописываю конструктор его потомка.
     Вопрос 1. Почему так?
*/

    public AnglelessShape() {
    }

    public int getCentreX() {
        return centreX;
    }

    public int getCentreY() {
        return centreY;
    }
 // нижеуказанного поля (своего) в данном классе нет и конструктора с ним тоже нет.
 //  Вопрос 2. Как тогда будет работать this в этом геттере. Что вернет геттер?
 // Вопрос 3. Если я это поле объявлю как private в родителе, то каким образоть реализовать этот геттер?
 // Потому что в таком синтаксисе IDEA  сразу выдает ошибку -  'borderThick' has private access in 'GraphicsEditor.Shape'
    public int getBorderThick() {
        return this.borderThick;
    }

    public String getColor() {
        return this.borderColor;
    }

}
