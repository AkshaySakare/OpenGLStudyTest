package com.apsakare.opengl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;

/**
 * Created by AKshay on 8/26/2017.
 */

class Triangle {
    private FloatBuffer mFVertexBuffer;
    private ByteBuffer mIndexBuffer;

    public Triangle() {

        float vertices[] = {
                -1f, -0.29f, -10f,
                1f, -0.29f, -10f,
                0f, 1f, -10f
        };

        byte indices[] = { 0, 1, 2 };

        mFVertexBuffer = makeFloatBuffer(vertices);

        mIndexBuffer = ByteBuffer.allocateDirect(indices.length);
        mIndexBuffer.put(indices);
        mIndexBuffer.position(0);
    }
    public void draw(GL10 gl) {
        gl.glVertexPointer(3, GL11.GL_FLOAT, 0, mFVertexBuffer);
        gl.glDrawElements(GL11.GL_TRIANGLES, 3, GL11.GL_UNSIGNED_BYTE, mIndexBuffer);
    }

    private static FloatBuffer makeFloatBuffer(float[] arr) {
        ByteBuffer bb = ByteBuffer.allocateDirect(arr.length * 4);
        bb.order(ByteOrder.nativeOrder());
        FloatBuffer fb = bb.asFloatBuffer();
        fb.put(arr);
        fb.position(0);
        return fb;
    }
}
