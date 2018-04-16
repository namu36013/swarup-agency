package com.example.admin.agency;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class Home extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    ImageView i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_home );

        i1=(ImageView)findViewById(R.id.image1);
        i2=(ImageView)findViewById(R.id.image2);
        i3=(ImageView)findViewById(R.id.image3);
        i4=(ImageView)findViewById(R.id.image4);
        i5=(ImageView)findViewById(R.id.image5);
        i6=(ImageView)findViewById(R.id.image6);
        i7=(ImageView)findViewById(R.id.image7);
        i8=(ImageView)findViewById(R.id.image8);
        i9=(ImageView)findViewById(R.id.image9);
        i10=(ImageView)findViewById(R.id.image10);
        i11=(ImageView)findViewById(R.id.image11);
        i12=(ImageView)findViewById(R.id.image12);





        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Home.this,a.class);
                startActivity(i);

            }
        });

       i2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent i=new Intent(Home.this,max.class);
                startActivity(i);

            }
        });

       i3.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent i=new Intent(Home.this,cavity.class);
                startActivity(i);

            }
        });


        i4.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent i=new Intent(Home.this,cavityprotection.class);
                startActivity(i);

            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Home.this,falero.class);
                startActivity(i);

            }
        });

        i6.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent i=new Intent(Home.this,falero1.class);
                startActivity(i);

            }
        });

        i7.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent i=new Intent(Home.this,dove1.class);
                startActivity(i);

            }
        });
        i8.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent i=new Intent( Home.this, dove2.class);
                startActivity(i);

            }
        });
        i9.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent i=new Intent(Home.this,plax.class);
                startActivity(i);

            }
        });
       i10.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent i=new Intent(Home.this,dove3.class);
                startActivity(i);

            }
        });
      /*  i11.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent i=new Intent(Home.this,junior.class);
                startActivity(i);

            }
        });
        i12.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent i=new Intent(Home.this,total.class);
                startActivity(i);

            }
        });*/








        Toolbar toolbar = (Toolbar) findViewById ( R.id.toolbar );
        setSupportActionBar ( toolbar );

       /* FloatingActionButton fab = (FloatingActionButton) findViewById ( R.id.fab );
        fab.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View view){
                Snackbar.make ( view, "Replace with your own action", Snackbar.LENGTH_LONG ).setAction ( "Action", null ).show ( );
            }
        } );*/

        DrawerLayout drawer = (DrawerLayout) findViewById ( R.id.drawer_layout );
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle ( this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close );
        drawer.addDrawerListener ( toggle );
        toggle.syncState ( );

        NavigationView navigationView = (NavigationView) findViewById ( R.id.nav_view );
        navigationView.setNavigationItemSelectedListener ( this );
    }

    @Override
    public void onBackPressed(){
        DrawerLayout drawer = (DrawerLayout) findViewById ( R.id.drawer_layout );
        if ( drawer.isDrawerOpen ( GravityCompat.START ) ) {
            drawer.closeDrawer ( GravityCompat.START );
        } else {
            super.onBackPressed ( );
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater ( ).inflate ( R.menu.home, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId ( );

        //noinspection SimplifiableIfStatement
        if ( id == R.id.action_settings ) {
            return true;
        }

        return super.onOptionsItemSelected ( item );
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item){
        // Handle navigation view item clicks here.
        int id = item.getItemId ( );

         if ( id == R.id.nav_gallery ) {

        }  else if ( id == R.id.nav_stores ) {
             Intent i=new Intent(Home.this,store.class);
             startActivity(i);

         }
        else if ( id == R.id.nav_share ) {

        } else if ( id == R.id.nav_contact ) {

             Intent i=new Intent(Home.this,Contact_us.class);
             startActivity(i);

         }else if ( id == R.id.nav_order ) {

             Intent i=new Intent(Home.this,my_order.class);
             startActivity(i);

         }

        DrawerLayout drawer = (DrawerLayout) findViewById ( R.id.drawer_layout );
        drawer.closeDrawer ( GravityCompat.START );
        return true;
    }
}
