package com.egoist.profpan;

import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.Paint;

import su.levenetc.android.textsurface.Text;
import su.levenetc.android.textsurface.TextBuilder;
import su.levenetc.android.textsurface.TextSurface;
import su.levenetc.android.textsurface.animations.Circle;
import su.levenetc.android.textsurface.animations.Delay;
import su.levenetc.android.textsurface.animations.Parallel;
import su.levenetc.android.textsurface.animations.Rotate3D;
import su.levenetc.android.textsurface.animations.Sequential;
import su.levenetc.android.textsurface.animations.ShapeReveal;
import su.levenetc.android.textsurface.animations.SideCut;
import su.levenetc.android.textsurface.animations.Slide;
import su.levenetc.android.textsurface.animations.TransSurface;
import su.levenetc.android.textsurface.contants.Align;
import su.levenetc.android.textsurface.contants.Direction;
import su.levenetc.android.textsurface.contants.Pivot;
import su.levenetc.android.textsurface.contants.Side;

/**
 * Created by goist on 2015/12/16.
 */
public class CookieThumperSample {

    public static void play(TextSurface textSurface, AssetManager assetManager) {

        //final Typeface robotoBlack = Typeface.createFromAsset(assetManager, "fonts/Roboto-Black.ttf");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        //paint.setTypeface(robotoBlack);

        Text textDaai = TextBuilder
                .create("Hello!!~")
                .setPaint(paint)
                .setSize(64)
                .setAlpha(0)
                .setColor(Color.RED)
                .setPosition(Align.SURFACE_CENTER).build();

        Text textBraAnies = TextBuilder
                .create("Merry Christmas~")
                .setPaint(paint)
                .setSize(33)
                .setAlpha(0)
                .setColor(Color.RED)
                .setPosition(Align.BOTTOM_OF, textDaai).build();


        Text textHaai = TextBuilder
                .create("聖誕節快樂")
                .setPaint(paint)
                .setSize(64)
                .setAlpha(0)
                .setColor(Color.WHITE)
                .setPosition(Align.BOTTOM_OF, textBraAnies).build();

        Text textDaaiAnies = TextBuilder
                .create("❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆❆")
                .setPaint(paint)
                .setSize(33)
                .setAlpha(0)
                .setColor(Color.GRAY)
                .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, textHaai).build();

        Text texThyLamInnie = TextBuilder
                .create("向收到禮物的人致敬")
                .setPaint(paint)
                .setSize(34)
                .setAlpha(0)
                .setColor(Color.WHITE)
                .setPosition(Align.RIGHT_OF, textDaaiAnies).build();

        Text textThrowDamn = TextBuilder
                .create("恭喜你！！")
                .setPaint(paint)
                .setSize(34)
                .setAlpha(0)
                .setColor(Color.RED)
                .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, texThyLamInnie).build();

        Text textDevilishGang = TextBuilder
                .create("希望這份禮物")
                .setPaint(paint)
                .setSize(24)
                .setAlpha(0)
                .setColor(Color.BLACK)
                .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, textThrowDamn).build();

        Text textSignsInTheAir = TextBuilder
                .create("可以訓練你的")
                .setPaint(paint)
                .setSize(24)
                .setAlpha(0)
                .setColor(Color.BLACK)
                .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, textDevilishGang).build();

            Text textSignsInTheAir1 = TextBuilder
                    .create("臂肌")
                    .setPaint(paint)
                    .setSize(28)
                    .setAlpha(0)
                    .setColor(Color.BLACK)
                    .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, textSignsInTheAir).build();

            Text textSignsInTheAir2 = TextBuilder
                    .create("胸肌")
                    .setPaint(paint)
                    .setSize(30)
                    .setAlpha(0)
                    .setColor(Color.BLACK)
                    .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, textSignsInTheAir1).build();

            Text textSignsInTheAir3 = TextBuilder
                    .create("腹肌")
                    .setPaint(paint)
                    .setSize(32)
                    .setAlpha(0)
                    .setColor(Color.BLACK)
                    .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, textSignsInTheAir2).build();

            Text textSignsInTheAir4 = TextBuilder
                    .create("二頭肌")
                    .setPaint(paint)
                    .setSize(34)
                    .setAlpha(0)
                    .setColor(Color.BLACK)
                    .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, textSignsInTheAir3).build();

            Text textSignsInTheAir5 = TextBuilder
                    .create(" &.....")
                    .setPaint(paint)
                    .setSize(24)
                    .setAlpha(0)
                    .setColor(Color.BLACK)
                    .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, textSignsInTheAir4).build();

            Text textSignsInTheAir6 = TextBuilder
                    .create("括約肌")
                    .setPaint(paint)
                    .setSize(40)
                    .setAlpha(0)
                    .setColor(Color.RED)
                    .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, textSignsInTheAir5).build();

            Text textSignsInTheAir7 = TextBuilder
                    .create("請你一定要在馬桶上")
                    .setPaint(paint)
                    .setSize(24)
                    .setAlpha(0)
                    .setColor(Color.BLACK)
                    .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, textSignsInTheAir6).build();
            Text textSignsInTheAir8 = TextBuilder
                    .create("坐好坐滿唷！")
                    .setPaint(paint)
                    .setSize(34)
                    .setAlpha(0)
                    .setColor(Color.RED)
                    .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, textSignsInTheAir7).build();
            Text textSignsInTheAir9 = TextBuilder
                    .create("希望這個電子卡片您會喜歡")
                    .setPaint(paint)
                    .setSize(24)
                    .setAlpha(0)
                    .setColor(Color.BLACK)
                    .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, textSignsInTheAir8).build();

            Text textSignsInTheAir10 = TextBuilder
                    .create("Merry Christmas~")
                    .setPaint(paint)
                    .setSize(24)
                    .setAlpha(0)
                    .setColor(Color.BLACK)
                    .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, textSignsInTheAir9).build();


            Text textSignsInTheAir11 = TextBuilder
                    .create("______________")
                    .setPaint(paint)
                    .setSize(18)
                    .setAlpha(0)
                    .setColor(Color.BLACK)
                    .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, textSignsInTheAir10).build();
            Text textSignsInTheAir12 = TextBuilder
                    .create("by 超帥柴魚")
                    .setPaint(paint)
                    .setSize(18)
                    .setAlpha(0)
                    .setColor(Color.RED)
                    .setPosition(Align.BOTTOM_OF | Align.RIGHT_OF, textSignsInTheAir11).build();

            Text textSignsInTheAir13 = TextBuilder
                    .create("2015.12.25")
                    .setPaint(paint)
                    .setSize(18)
                    .setAlpha(0)
                    .setColor(Color.BLACK)
                    .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, textSignsInTheAir12).build();

        textSurface.play(
                new Sequential(
                        ShapeReveal.create(textDaai, 750, SideCut.show(Side.LEFT), false),
                        new Parallel(ShapeReveal.create(textDaai, 600, SideCut.hide(Side.LEFT), false), new Sequential(Delay.duration(500), ShapeReveal.create(textDaai, 600, SideCut.show(Side.LEFT), false))),
                        new Parallel(new TransSurface(500, textBraAnies, Pivot.CENTER), ShapeReveal.create(textBraAnies, 1300, SideCut.show(Side.LEFT), false)),
                        Delay.duration(1000),

                        new Parallel(TransSurface.toCenter(textHaai, 750), Rotate3D.showFromSide(textHaai, 750, Pivot.TOP)),
                        Delay.duration(1000),
                        new Parallel(TransSurface.toCenter(textDaaiAnies, 500), Slide.showFrom(Side.TOP, textDaaiAnies, 500)),
                        Delay.duration(500),
                        new Parallel(TransSurface.toCenter(texThyLamInnie, 750), Slide.showFrom(Side.LEFT, texThyLamInnie, 500)),
                        Delay.duration(500),
                        new Parallel(
                                new TransSurface(4000, textSignsInTheAir4, Pivot.CENTER),
                                new Sequential(
                                        new Sequential(ShapeReveal.create(textThrowDamn, 500, Circle.show(Side.CENTER, Direction.OUT), false)),
                                        Delay.duration(1000),
                                        new Sequential(ShapeReveal.create(textDevilishGang, 500, Circle.show(Side.CENTER, Direction.OUT), false)),
                                        Delay.duration(1000),
                                        new Sequential(ShapeReveal.create(textSignsInTheAir, 500, Circle.show(Side.CENTER, Direction.OUT), false)),
                                        Delay.duration(1000),
                                        new Sequential(ShapeReveal.create(textSignsInTheAir1, 500, Circle.show(Side.CENTER, Direction.OUT), false)),
                                        Delay.duration(1000),
                                        new Sequential(ShapeReveal.create(textSignsInTheAir2, 500, Circle.show(Side.CENTER, Direction.OUT), false)),
                                        Delay.duration(1000),
                                        new Sequential(ShapeReveal.create(textSignsInTheAir3, 500, Circle.show(Side.CENTER, Direction.OUT), false)),
                                        Delay.duration(1000),
                                        new Sequential(ShapeReveal.create(textSignsInTheAir4, 500, Circle.show(Side.CENTER, Direction.OUT), false)),
                                        Delay.duration(1000),
                                        new Sequential(ShapeReveal.create(textSignsInTheAir5, 500, Circle.show(Side.CENTER, Direction.OUT), false)),
                                        Delay.duration(1000),
                                        new Sequential(ShapeReveal.create(textSignsInTheAir6, 500, Circle.show(Side.CENTER, Direction.OUT), false)),
                                        Delay.duration(1000),
                                        new Sequential(ShapeReveal.create(textSignsInTheAir7, 500, Circle.show(Side.CENTER, Direction.OUT), false)),
                                        Delay.duration(1000),
                                        new Sequential(ShapeReveal.create(textSignsInTheAir8, 500, Circle.show(Side.CENTER, Direction.OUT), false)),
                                        Delay.duration(1000),
                                        new Sequential(ShapeReveal.create(textSignsInTheAir9, 500, Circle.show(Side.CENTER, Direction.OUT), false)),
                                        Delay.duration(1000),
                                        new Sequential(ShapeReveal.create(textSignsInTheAir10, 500, Circle.show(Side.CENTER, Direction.OUT), false)),


                                        new Sequential(ShapeReveal.create(textSignsInTheAir11, 500, Circle.show(Side.RIGHT, Direction.OUT), false)),
                                        Delay.duration(1000),
                                        new Sequential(ShapeReveal.create(textSignsInTheAir12, 500, Circle.show(Side.RIGHT, Direction.OUT), false)),
                                        Delay.duration(1000),
                                        new Sequential(ShapeReveal.create(textSignsInTheAir13, 500, Circle.show(Side.RIGHT, Direction.OUT), false))

                                )
                        ),
                        Delay.duration(200)
                        /*new Parallel(
                                ShapeReveal.create(textThrowDamn, 1500, SideCut.hide(Side.LEFT), true),
                                new Sequential(Delay.duration(250), ShapeReveal.create(textDevilishGang, 1500, SideCut.hide(Side.LEFT), true)),
                                new Sequential(Delay.duration(500), ShapeReveal.create(textSignsInTheAir, 1500, SideCut.hide(Side.LEFT), true)),
                                Alpha.hide(texThyLamInnie, 1500),
                                Alpha.hide(textDaaiAnies, 1500)
                        )*/
                )
        );

    }

}