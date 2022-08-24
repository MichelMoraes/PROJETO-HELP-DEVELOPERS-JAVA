package com.br.devs.java.api.controllers;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/")
@RequiredArgsConstructor
@Tag(name = "3. Testes Unitários ", description = "Testes Unitários")
public class TestesUnitariosController {

    @Operation(summary = "Retorna os detalhes sobre Testes Unitários")
    @GetMapping("testes")
    public String detailTestes() {
        return " Exemplo Teste: \n"+
                "\n" +
                "@ExtendWith(MockitoExtension.class)\n" +
                "class CountryControllerTest {\n" +
                "\n" +
                "    @InjectMocks\n" +
                "    CountryController countryController;\n" +
                "    @Mock\n" +
                "    CountryService service;\n" +
                "\n" +
                "    @BeforeEach\n" +
                "    void setUp() {\n" +
                "        MockitoAnnotations.openMocks(this);\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    @Test\n" +
                "    void testeDevePassarQuandoFizerPost(){\n" +
                "\n" +
                "        Country country1 = new Country();\n" +
                "        country1.setId(1);\n" +
                "        country1.setName(\"BRASIL\");\n" +
                "\n" +
                "        MockHttpServletRequest request = new MockHttpServletRequest();\n" +
                "        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));\n" +
                "\n" +
                "        // verifica se o que foi salvo é o mesmo que é esperado no country\n" +
                "        assertEquals(country1.getName(), countryController.save().getName());\n" +
                "        assertEquals(country1.getId(), countryController.save().getId());\n" +
                "\n" +
                "        // verifica se o método foi chamado pelo menos 1 vez\n" +
                "        verify(service, atMost(1)).save(country1);\n" +
                "    }\n" +
                "\n" +
                "}";
    }


}
