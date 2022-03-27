package me.kovp.views.counter.presentation

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import me.kovp.core_ui.theme.LightBlue
import java.nio.file.WatchEvent

class StringPreviewProvider : PreviewParameterProvider<String> {
    override val values: Sequence<String>
        get() = sequenceOf("text")
}

@OptIn(ExperimentalMaterialApi::class)
@Preview
@Composable
fun Counter(
    @PreviewParameter(StringPreviewProvider::class)
    text: String,
    modifier: Modifier = Modifier,
    onDecrease: () -> Unit = {},
    onIncrease: () -> Unit = {}
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
//        CounterButton(
//            isLeft = true,
//            drawIcon = {
//                drawLine(
//                    color = Color.White,
//                    start = Offset(6.dp.toPx(), 13.dp.toPx()),
//                    end = Offset(20.dp.toPx(), 13.dp.toPx()),
//                    strokeWidth = 2.dp.toPx()
//                )
//            }
//        )
        Card(
            modifier = Modifier
                .padding(2.dp)
                .size(26.dp)
                ,
            elevation = 28.dp,
            backgroundColor = LightBlue,
            shape = RoundedCornerShape(
                topStart = 13.dp,
                topEnd = 0.dp,
                bottomEnd = 0.dp,
                bottomStart =13.dp,
            )
        ) {
//            Box(modifier= Modifier.background(LightBlue))
        }

        Text(
            modifier = Modifier
                //                .shadow(elevation = 4.dp)
                .width(56.dp)
                .height(26.dp),
            textAlign = TextAlign.Center,
            text = text
        )

        CounterButton(
            isLeft = false,
            drawIcon = {
                drawLine(
                    color = Color.White,
                    start = Offset(6.dp.toPx(), 13.dp.toPx()),
                    end = Offset(20.dp.toPx(), 13.dp.toPx()),
                    strokeWidth = 2.dp.toPx()
                )
                drawLine(
                    color = Color.White,
                    start = Offset(13.dp.toPx(), 6.dp.toPx()),
                    end = Offset(13.dp.toPx(), 20.dp.toPx()),
                    strokeWidth = 2.dp.toPx()
                )
            },
            onClick = onIncrease
        )
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun CounterButton(
    isLeft: Boolean,
    drawIcon: DrawScope.() -> Unit,
    onClick: () -> Unit = {}
) {
    Box {


    Card(
        modifier = Modifier
            .padding(15.dp)
            .size(26.dp)
            ,
        elevation = 4.dp,
        shape = RoundedCornerShape(
            topStart = if (isLeft) 13.dp else 0.dp,
            topEnd = if (isLeft) 0.dp else 13.dp,
            bottomEnd = if (isLeft) 0.dp else 13.dp,
            bottomStart = if (isLeft) 13.dp else 0.dp,
        ),
        backgroundColor = LightBlue,
        onClick = onClick
    ) {
        Canvas(modifier = Modifier) {
            drawIcon()
        }
    }
    }
}
