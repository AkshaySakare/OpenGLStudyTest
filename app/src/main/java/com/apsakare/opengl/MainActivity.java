package com.apsakare.opengl;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.WindowManager;

public class MainActivity extends Activity{
    GLSurfaceView view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        view = new GLSurfaceView(this);
        view.setRenderer(new ShapeRenderer());
        setContentView(view);
    }

    @Override
    protected void onPause() {
        super.onPause();
        view.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        view.onResume();
    }
}
//public static int POSITION_ATTRIBUTE=0;
   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GLSurfaceView glSurfaceView=new GLSurfaceView(this);
        glSurfaceView.setEGLConfigChooser(8,8,8,8,0,0);
        glSurfaceView.setEGLContextClientVersion(2);
        glSurfaceView.setRenderer(this);
        setContentView(glSurfaceView);

       // setContentView(R.layout.activity_main);
    }

    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        String vertexshadersource=""+
                "attribute vec2 Position; \n"+
                "\n"+
                "void main() \n"+
                "{\n"+
                "gl_Position=vec4(Position.x,Position.y,0.0,1.0);\n"+
                "}\n"+
                "\n";
        String fragmentexshadersource=""+
                "\n"+
                "\n"+
                "void main() \n"+
                "{\n"+
                "gl_FragColor=vec4(1.0,1.0,0.0,1.0);\n"+
                "}\n"+
                "\n";

        int vertexshader=GLES20.glCreateShader(GLES20.GL_VERTEX_SHADER);
        GLES20.glShaderSource(vertexshader,vertexshadersource);
        GLES20.glCompileShader(vertexshader);
        Log.e("VERTEX SHADER","32--->"+GLES20.glGetShaderInfoLog(vertexshader));

        //here a fragment shader
        int fragmentshader=GLES20.glCreateShader(GLES20.GL_FRAGMENT_SHADER);
        GLES20.glShaderSource(fragmentshader,fragmentexshadersource);
        GLES20.glCompileShader(fragmentshader);
        Log.e("VERTEX SHADER","32--->"+GLES20.glGetShaderInfoLog(fragmentshader));
int program=GLES20.glCreateProgram();
        GLES20.glAttachShader(program,vertexshader);
        GLES20.glAttachShader(program,fragmentshader);
        GLES20.glBindAttribLocation(program,POSITION_ATTRIBUTE,"Position");
        GLES20.glLinkProgram(program);
        Log.e("Link","59--->"+GLES20.glGetProgramInfoLog(program));

        GLES20.glClearColor(0.1f,0.8f,0.2f,1.0f);
        GLES20.glEnableVertexAttribArray(POSITION_ATTRIBUTE);
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {

    }

    @Override
    public void onDrawFrame(GL10 gl) {
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT| GLES20.GL_DEPTH_BUFFER_BIT);
        float[]gemootry=new float[]{
                -1.0f,1.0f,
                1.0f,1.0f,
                0.0f,-1.0f
        };
        ByteBuffer gemoBuffer= ByteBuffer.allocate(gemootry.length*4);
        gemoBuffer.order(ByteOrder.nativeOrder());
        gemoBuffer.position(0);                 //!!!!!!!!!!!!!
        //bufferVertecesLines.position(0);
        FloatBuffer flotBuffer=gemoBuffer.asFloatBuffer();
        flotBuffer.put(gemootry);
        flotBuffer.rewind();
//        GLES20.glVertexAttribPointer(0,2,GLES20.GL_FLOAT,false,4*2,flotBuffer);
      //  GLES20.glVertexAttrib2fv(POSITION_ATTRIBUTE,gemootry,0);
GLES20.glDrawArrays(GLES20.GL_TRIANGLES,0,gemootry.length/2);
    }
}
*/