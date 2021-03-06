/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.7).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package br.com.saldo.positivo.swagger.api;

import br.com.saldo.positivo.swagger.model.LancamentoMes;
import br.com.saldo.positivo.swagger.model.PagamentoTitulo;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-07-11T10:58:41.180673-03:00[America/Sao_Paulo]")
@Api(value = "titulos", description = "the titulos API")
public interface TitulosApi {

    Logger log = LoggerFactory.getLogger(TitulosApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "Serviço para realizar lançamentos de despesas do mes", nickname = "deleteLancamentosTitulo", notes = "", tags={ "Titulos", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Sucesso") })
    @RequestMapping(value = "/titulos/lancamentos/{id}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteLancamentosTitulo(@ApiParam(value = "",required=true) @PathVariable("id") String id) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default TitulosApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Serviço para realizar lançamentos de despesas do mes", nickname = "lancamentosTitulo", notes = "", response = LancamentoMes.class, responseContainer = "List", tags={ "Titulos", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Sucesso", response = LancamentoMes.class, responseContainer = "List") })
    @RequestMapping(value = "/titulos/lancamentos/{ano}/{mes}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<LancamentoMes>> lancamentosTitulo(@ApiParam(value = "",required=true) @PathVariable("ano") Integer ano,@ApiParam(value = "",required=true) @PathVariable("mes") Integer mes) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default TitulosApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Serviço para realizar lançamentos de despesas do mes", nickname = "putLancamentosTitulo", notes = "", tags={ "Titulos", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Sucesso") })
    @RequestMapping(value = "/titulos/lancamentos",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> putLancamentosTitulo(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LancamentoMes body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default TitulosApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Serviço para realizar lançamentos de despesas do mes", nickname = "putPagamentoTitulo", notes = "", tags={ "Titulos", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Sucesso") })
    @RequestMapping(value = "/titulos/lancamentos/pagar",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> putPagamentoTitulo(@ApiParam(value = "" ,required=true )  @Valid @RequestBody PagamentoTitulo body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default TitulosApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
