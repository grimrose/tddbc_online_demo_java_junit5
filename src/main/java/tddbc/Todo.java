package tddbc;

import java.util.Map;

import java.util.HashMap;

public class Todo {
    private Map<String, Object> todos;

    public Todo() {
        this.todos = new HashMap<String, Object>();
    }


    // 状態を変更する為のメソッド
    // 成功すれば空の文字列、失敗すればメッセージの文字列が帰ってくる

    // 何らかの処理を実行するメソッド

    // 処理結果を取得するメソッドがずらずらと

    // private void 外部にアクセスしているメソッド()

    // 内部で外部にアクセスしている箇所があるので、戻すメソッド

    public Map<String, Object> getTodos() {
        return this.todos;
    }

    public void setTodos(Map<String, Object> todos) {
        this.todos = todos;
    }

}
