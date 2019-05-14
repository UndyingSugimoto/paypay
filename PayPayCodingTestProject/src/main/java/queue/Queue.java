package queue;

public interface Queue<T> {

    /**
     * キューに末尾にオブジェクトをインサートする。
     *
     * @param t オブジェクト
     * @return インサート後の新しいキュー
     */
    public Queue<T> enQueue(T t);

    /**
     * キューの先頭のオブジェクトをリムーブする。
     *
     * @return リムーブ後の新しいオブジェクト
     */
    public Queue<T> deQueue();

    /**
     * キューの先頭のオブジェクトを取得する。
     *
     * @return 先頭オブジェクト
     */
    public T head();

    /**
     * キューが空である場合に真を返す。
     *
     * @return キューが空か否か
     */
    public boolean isEmpty();
}
