package Exceptions.Seminar3.task2;

public class Counter implements AutoCloseable {

    private int counter;
    private boolean isOpen;

    public int getCounter() {
        return counter;
    }

    /**
     * Увеличить значение текущего счетчика на 1
     * @return актуальное значение счетчика
     * @throws CloseCounterException Счетчик закрыт
     */
    public int add() throws CloseCounterException{
        if (!isOpen)
            throw new CloseCounterException("Счетчик закрыт");
        return ++counter;
    }

    public Counter() {
        isOpen = true;
    }

    public Counter(int counter) {
        this.counter = counter;
        isOpen = true;
    }

    @Override
    public void close() {
        isOpen = false;;
    }
}
