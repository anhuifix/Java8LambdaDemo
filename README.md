# Java8LambdaDemo

###Java8  Lambda表达式学习


    //点击事件表达式
        findViewById(R.id.tv_buton).setOnClickListener(v -> {
            Toast.makeText(this,"\"普通的点击事件\"",0).show();
        });

        //线程事件表达式
        findViewById(R.id.tv_throw).setOnClickListener(v -> {

            new Thread(() -> {
                ((TextView)findViewById(R.id.tv_throw)).setText("修改成功");
            }).start();
        });
        
        
        主要在Android Studio 中配置下
        
         compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
        }
