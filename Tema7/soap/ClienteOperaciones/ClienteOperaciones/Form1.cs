using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ClienteOperaciones
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            int a = int.Parse( txtA.Text);
            int b = int.Parse(txtB.Text);
            int c =0;
            Servicios.WSOperacionesSoapClient op = new Servicios.WSOperacionesSoapClient();
            switch (cOperacion.SelectedIndex) {
                case 0:
                    
                    c=op.Sumar(a, b);
                    break;
                case 1:
                    c = op.Restar(a, b);
                    break;
                case 2:
                    c = op.Multiplicar(a, b);
                    break;

                case 3:
                    c = op.Dividir(a, b);
                    break;
            }
            Resultado.Text = c.ToString();
        }
    }
}
