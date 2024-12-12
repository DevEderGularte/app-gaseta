package devandroid.edergularte.appgaseta.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class GasEtaDB extends SQLiteOpenHelper {
    public static final String DB_NAME = "gaseta.db";
    public static final int DB_VERSION = 1;
    Cursor cursor;
    SQLiteDatabase db;
    public GasEtaDB(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //QUERY SQL para criar uma tabela
        String sqlTabelaCombustivel = "CREATE TABLE Combustivel (id INTEGER PRIMARY KEY AUTOINCREMENT, nomeDoCombustivel TEXT, precoDoCombustivel REAL, recomendacao TEXT)";
        db.execSQL(sqlTabelaCombustivel);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    //Criar Metodos parimplementar um CRUD
    // C = CREATE criar o banco de dados e tabelas
    // CREATE database(SQL)
    // CREATE table (SQL)
    // 1 - Nome do Banco de Dados
    // 2 - Versão do Banco de Dados

    // R = RETRIEV recuperar dados da tabela
    // SELECT * FROM table (SQL)
    //

    // U = UPDATE alterar dados salvos na tabela
    // UPDATE from table (SQL)

    // D = DETELE excluir dados salvos na tabela
    // DELETE from (SQL)
}
