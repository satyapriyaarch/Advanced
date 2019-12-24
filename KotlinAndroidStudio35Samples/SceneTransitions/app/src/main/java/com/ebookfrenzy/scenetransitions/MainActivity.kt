package com.ebookfrenzy.scenetransitions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Scene
import android.view.View
import android.transition.TransitionManager
import android.transition.TransitionInflater
import android.transition.Transition

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var scene1: Scene? = null
    var scene2: Scene? = null
    var transitionMgr: Transition? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        transitionMgr = TransitionInflater.from(this)
            .inflateTransition(R.transition.transition)

        scene1 = Scene.getSceneForLayout(rootContainer,
            R.layout.scene1_layout, this)

        scene2 = Scene.getSceneForLayout(rootContainer,
            R.layout.scene2_layout, this)

        scene1?.enter()
    }

    fun goToScene2(view: View) {
        TransitionManager.go(scene2, transitionMgr)
    }

    fun goToScene1(view: View) {
        TransitionManager.go(scene1, transitionMgr)
    }

}
