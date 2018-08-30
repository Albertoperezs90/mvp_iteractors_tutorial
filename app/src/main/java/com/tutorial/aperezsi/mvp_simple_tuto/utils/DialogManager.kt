package com.tutorial.aperezsi.mvp_simple_tuto.utils

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.view.LayoutInflater
import android.widget.ProgressBar
import com.tutorial.aperezsi.mvp_simple_tuto.R

object DialogManager {

    private var dialog: AlertDialog? = null

    fun showProgressDialog(context: Context) {
        val alertDialog = AlertDialog.Builder(context)
        val view = LayoutInflater.from(context).inflate(R.layout.lay_progress_dialog, null)
        alertDialog.setView(view)
        alertDialog.setCancelable(false)
        dialog = alertDialog.create()
        dialog?.show()
    }


    fun hideProgressDialog() {
        dialog?.hide()
    }


    fun showErrorDialog(context: Context){
        val alertDialog = AlertDialog.Builder(context)

        alertDialog
                .setTitle("Se ha producido un error")
                .setMessage("Parece que hay un problema con la conexión")
                .setPositiveButton("Cerrar", DialogInterface.OnClickListener { dialogInterface, i ->
                    dialog?.dismiss()
                })

        dialog = alertDialog.create()
        dialog?.show()
    }
}