package com.example.tmsmy;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 /*DatabaseHelper myDb;
 EditText editTextId, editName,editSurname,editMarks;
 Button btnAddData,btngetData,btnUpdate,btnDelete,btnViewAll;*/

Button btn_houses,btn_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         btn_houses=(Button)findViewById(R.id.btn_houses);
         btn_view=(Button)findViewById(R.id.btn_view);


         btn_houses.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent=new Intent(MainActivity.this,my_houses.class);
                 startActivity(intent);
             }
         });

         btn_view.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent1=new Intent(MainActivity.this,my_view.class);
                 startActivity(intent1);
             }
         });
        /* myDb=new DatabaseHelper(this);

        editTextId=(EditText) findViewById(R.id.editText_id);
        editName=(EditText) findViewById(R.id.editText_name);
        editSurname=(EditText) findViewById(R.id.editText_surname);
        editMarks=(EditText) findViewById(R.id.editText_marks);

        btnAddData=(Button)findViewById(R.id.button_add);
        btngetData=(Button)findViewById(R.id.button_view);
        btnUpdate=(Button)findViewById(R.id.button_update);
        btnDelete=(Button)findViewById(R.id.button_delete);
        btnViewAll=(Button)findViewById(R.id.button_viewAll);

        AddData();
        getData();
        updateData();
        deleteData();
        viewAll();*/

    }



   /* private void AddData() {
        btnAddData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isInseted=myDb.insertData(editName.getText().toString(),editSurname.getText().toString(),editMarks.getText().toString());
                if (isInseted==true)
                    Toast.makeText(MainActivity.this, "DATA INSERTED SUCCESFULLY", Toast.LENGTH_SHORT).show();

                       else
                    Toast.makeText(MainActivity.this, "FAiled", Toast.LENGTH_SHORT).show();

            }
        }); }




    private void getData() {
        btngetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id =editTextId.getText().toString();

                if (id.equals(String.valueOf(""))){
                    editTextId.setError("Enter ID to get data");
                    return;
                }
                Cursor res =myDb.getData(id);
                String data=null;

                if (res.moveToFirst()){

                    data = "Id:"+res.getString(0)+"\n"+
                            "Name :"+ res.getString(1)+"\n\n"+
                            "Surname :"+ res.getString(2)+"\n\n"+
                            "Marks :"+ res.getString(3)+"\n\n";
                }
                showMessage("Data", data);
            }
        });

    }

    private void viewAll() {
        btnViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Cursor res=myDb.getAllData();
                if(res.getCount() == 0) {
                    // show message
                    showMessage("Error","Nothing found");
                    return;
                }
                StringBuffer buffer=new StringBuffer();
                while(res.moveToNext()){
                    buffer.append("Id:"+res.getString(0)+"\n");
                    buffer.append("Name :"+ res.getString(1)+"\n\n");
                    buffer.append("Surname :"+ res.getString(2)+"\n\n");
                    buffer.append("Marks :"+ res.getString(3)+"\n\n");
                }
                showMessage("Data",buffer.toString());



            }
        });

    }
    private void updateData() {
     btnUpdate.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

             boolean isUpdate = myDb.updateData(editTextId.getText().toString(),
                     editName.getText().toString(),
                     editSurname.getText().toString(),editMarks.getText().toString());
             if(isUpdate == true)
                 Toast.makeText(MainActivity.this,"Data        Update",Toast.LENGTH_LONG).show();
             else
                 Toast.makeText(MainActivity.this,"Data could not be Updated",Toast.LENGTH_LONG).show();


         }
     });
    }



    private void deleteData() {
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Integer deletedRows = myDb.deleteData(editTextId.getText().toString());
                if(deletedRows > 0)
                    Toast.makeText(MainActivity.this,"Data Deleted",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this,"Data could not be Deleted",Toast.LENGTH_LONG).show();


            }
        });



    }







    private void showMessage (String title, String message) {
        AlertDialog.Builder builder= new AlertDialog.Builder(this);
        builder.create();
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }





*/

}
