package com.dave_devs.countrieslistwithgraphql.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dave_devs.countrieslistwithgraphql.domain.SimpleCountry

@Composable
fun CountryItem(
    country: SimpleCountry,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = country.emoji,
            fontSize = 30.sp
        )
        Spacer(Modifier.width(16.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = country.name,
                fontSize = 24.sp
            )
            Spacer(Modifier.width(16.dp))
            Text(
                text = country.capital,
                fontSize = 24.sp
            )
        }

    }
}