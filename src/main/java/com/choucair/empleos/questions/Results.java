package com.choucair.empleos.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import com.choucair.empleos.user_interfaces.ChoucairEmpleosPage;

public class Results implements Question<String> {
  @Override
  public String answeredBy(Actor actor) {
    return Text.of(ChoucairEmpleosPage.RESULT_MESSAGE).viewedBy(actor).asString();
  }

  public static Results resultMessage() {
    return new Results();
  }
}
