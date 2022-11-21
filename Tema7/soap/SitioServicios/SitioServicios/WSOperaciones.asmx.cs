using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace SitioServicios
{
    /// <summary>
    /// Descripción breve de WSOperaciones
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class WSOperaciones : System.Web.Services.WebService
    {

        [WebMethod]
        public int Sumar(int A,int B)
        {
            return A + B;
        }
        [WebMethod]
        public int Restar(int A, int B)
        {
            return A - B;
        }

        [WebMethod]
        public int Multiplicar(int A, int B)
        {
            return A * B;
        }
        [WebMethod]
        public int Dividir(int A, int B)
        {
            return A / B;
        }
    }
}
