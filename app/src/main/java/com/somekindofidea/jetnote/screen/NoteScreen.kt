package com.somekindofidea.jetnote.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.somekindofidea.jetnote.R
import com.somekindofidea.jetnote.componets.NoteButton
import com.somekindofidea.jetnote.componets.NoteInputText

@ExperimentalComposeUiApi
@Composable
fun NoteScreen() {
    var title by remember {
        mutableStateOf( "")
    }

    var description by remember {
        mutableStateOf("")
    }

    Column(modifier =  Modifier.padding(6.dp)) {
        TopAppBar(
            title = {
                Text(text = stringResource(id = R.string.app_name)) },
            actions = {
                Icon(
                    imageVector = Icons.Rounded.Notifications,
                    contentDescription = "Icon"
                )
            },
            backgroundColor = Color(0xFFDADFE3)
        )

        // Content
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            NoteInputText(
                text = title,
                label = "Title",
                onTextChange = {
                               if (it.all { char ->
                                       char.isLetter() || char.isWhitespace()
                                   }) title = it
                },
            )
            NoteInputText(
                text = description,
                label = "Add A Note",
                onTextChange = {
                    if (it.all { char ->
                            char.isLetter() || char.isWhitespace()
                        }) description = it
                },
                modifier = Modifier.padding(top = 9.dp, bottom = 10.dp)
            )
            NoteButton(text = "Save", onClick = { /*TODO*/ })
        }
    }
}

@ExperimentalComposeUiApi
@Preview(showBackground = true)
@Composable
fun NotesScreenPreview() {
    NoteScreen()
}