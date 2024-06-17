package com.gorkemdemirkiran.my_application_kotlin_training

import android.net.ipsec.ike.TunnelModeChildSessionParams.TunnelModeChildConfigRequest
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }






        println("merhaba torun")



        // VARIABLES AND DATA TYPES
        println("--------VARIABLES-DATA TYPES--------")
        var x =10
        println(x)
        println(x*20)
        x=30
        println(x*30)

        // değerini sonradan değiştirmeyeceğin bir değeri "val" açılımı "value" ile tanımla
        // değişecek değeri "var" açılımı "variable" ile tanımla

        val z=20

        //implicit // kapalı şekilde tanımlama kotlin algılamasını bekliyor.
        var y=450
        println(y*20)

        // INTEGER - TAM SAYILAR
        println("--------INTEGER---------")

        //explicit  //açık şekilde tanımlama
        // açık şekilde verinin büyüklüğüne göre değişken tanımladık.
        // gerek yok yine aynı şey çok büyük verilerde ya da daha az yer
        // kaplaması için yapılabilir.
        var example_short : Short =10
        var example_byte : Byte= 15
        var exaample_ınt : Int =200

        //snake_case
        //camel_case




        // DOUBLE-FLOAT - KESİRLİ SAYILAR
        println("--------DOUBLE-FLOAT---------")

        var ınteger=2000000
        var pi=3.1413

        println(5/2)      // tam sayı verir.
        println(5.0/2.0)  // ondalık sayı olarak verir.


        var example_double=4.3

        var example_float:Float=2.25f



        // UNSIGNED INTEGER TYPES
        // negatif sayıları tutmayan türler
        // byte-8 bit -128,127 arasında
        // ubyte-8 bit  0,255 arasında
        var u_example_short : UShort =10u
        var u_example_byte : UByte= 15u
        var u_exaample_ınt : UInt =200u




        // STRINGS
        println("--------STRINGS---------")
        val my_dictionary="Benim çalışmalarım"
        println(my_dictionary)
        println(my_dictionary.uppercase())
        val name="clarke"
        val surname="kent"
        println(name + " " + surname)




        // DÖNÜŞÜMLER VE INIT
        println("--------DÖNÜŞÜMLER- INIT---------")

        // değeri atamadan değişkeni tanımladık.
        val my_str:String
        my_str="ad"     // initialize etmektir.init,initialization,değerin atandığı zamandır.

        // Conversion
        val old="20"

        val old_init=old.toInt()
        var old_long=old.toLong()
        println(old_init)
        println(old_long)







        //  BOOLEAN
        println("------Boolean-------")
        // true,false
        var my_booelean:Boolean = true
        my_booelean = false


        // == eşittir
        // != eşit değildir
        // && ve
        // || veya
        // <= küçük eşit
        // >= büyük eşit




        // VERİ YAPILARI
        // içinde birden fazla eleman tutan veri yapıları



        // ARRAYS
        println("------ARRAYS--------")

        val sd="my_course"
        val my_array= arrayOf(sd,"python","kotlin","c","django")

        println(my_array[0])
        println(my_array.last())

        // array sabit olarak tanımlasakta içindeki elemanları
        // değiştirmeye izin veriyor.

        my_array[2]="sim"

        // bu şekilde de eleman alabiliriz.
        println(my_array.get(2))

        // dizilere sonradan ekleme ve çıkarma yapamayız
        // sadece değiştirebiliriz.






        // ARRAYLIST  - LİSTE DİYE GEÇER
        // Daha esnek dizilerdir.

        val my_list= arrayListOf("asd","amg","bnm")

        println(my_list.size)

        my_list.add("abv")
        println(my_list.get(3))

        // <> içerik veri türünü seçmemizi sağlar ve sonradan doldurabiliriz.

        // 2 farklı şekilde oluşturabiliriz.
        val new_list= arrayListOf<Int>()
        val new1_list=ArrayList<Int>()
        // Karışık boş liste
        val crush= arrayListOf<Any>()




        // SET
        // İçersinde tekil eleman barımdıran index olmayan elemandır.
        println("-----SET------")

        val setted= setOf(10,10,20,20)
        setted.size

        setted.forEach{
            println(it)
        }

        // Hashset ,set gibi tek değer tutar
        // listelere göre daha hızlı arama yapar listelerde 15
        // değerini ararken hepsini sayar ve linear zamanda arama yapar.
        // hashset hızlı arama yapar.

        // Setof "add" kullanarak ekleme yapamıyoruz.
        // Hashset "add" ekleme yapabiliyoruz.
        val empty_set=HashSet<String>()
        empty_set.add("az")
        empty_set.add("rz")
        empty_set.add("gy")
        empty_set.add("nm")
        empty_set.add("vy")

        empty_set.forEach{
            println(it)
        }

        // Bu şekilde normal diziyi de hashset yaparak değişiklik
        // yapabiliriz.
        val new_dt=setted.toHashSet()

        // MAP
        // Dictionary olarakta geçer
        // Anahtar-Değer eşleşmesi olarakta geçer.
        // index değil key-value eşleşmesi ile bullunur.


        val cook_Array= arrayListOf("elma","armut","karpuz")
        val calori_array= arrayListOf(100,150,200)

        println("${cook_Array[0]} énın kalorisi ${calori_array}")

        val maps= hashMapOf<String,Int>()
        maps.put("elma",100)
        maps.put("armut",150)

        println(maps["elma"])

        maps.put("elma",300)
        // eklersek eski değeri siliyor.




        // IF KONTROLLERİ // IF STAINTMENT
        println("------IF-------")
        var number=10
        number=number+1

        number++   // 1 ekler
        number--   // 1 çıkartır

        // Kalanını bulma - remainder
        println(10%4) // 10'un 4'e bölümünden kalanını bulur.

        val score=10

        if(score<10){
            println("geçti")
        }else if(score>=10 && score <20){
            println("oyun idare eder")
        }else{
            println("kaldı")
        }



        // WHEN KONTROL MEKANİZMASI
        // çok fazla koşulu kontrol etmek için iyidir.
        println("------WHEN-------")

        val note=0
        var note_string=""
        when(note){
            0 -> note_string="geçersiz not"
            1 -> note_string="zayıf"
            2 -> note_string="kötü"
            3 -> note_string="orta"
            else -> note_string="böyle bir note yok"

        }
        println(note_string)
        // WHILE DÖNGÜSÜ
        println("------WHILE-------")
        var i=0
        while(i<10){
            println(i)
            i=i+1
        }




        // FOR DÖNGÜSÜ
        println("------FOR-------")

        val other_array= arrayListOf(5,10,15,20)

        println("loop started")
        for(number in other_array){
            println(number*5)
        }
        println("loop finished")

        // Range
        for(num in 0..20){
            println(num*20)
        }

        val my_string=ArrayList<String>()
        my_string.add("stranger things")
        my_string.add("monroe")
        my_string.add("vrogen")

        for (value in my_string){
            println(value.uppercase())
        }


        my_string.forEach(){
            println(it.uppercase())
        }

        my_string.forEach(){dct ->
            println(dct.uppercase())
        }


    }
}